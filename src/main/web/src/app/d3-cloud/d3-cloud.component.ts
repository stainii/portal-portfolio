import {Component, ElementRef, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import {D3CloudWord} from "../d3-cloud-word";

declare var d3: any;

@Component({
    selector: 'portfolio-d3-cloud',
    template: ""
})
export class D3CloudComponent implements OnInit, OnChanges {

    @Input()
    words: D3CloudWord[];

    @Input()
    width: number;

    @Output()
    wordClicked: EventEmitter<any> = new EventEmitter();

    constructor(private el: ElementRef) {
    }

    ngOnInit() {}

    ngOnChanges(changes: SimpleChanges) {
        if (!this.width || !this.words) {
            return;
        }

        let el = this.el;
        let wordClicked = this.wordClicked;

        //clear component, if anything has been drawn earlier
        el.nativeElement.innerHTML = "";

        //draw
        let layout = d3.layout
            .cloud()
            .size([this.width, 500])
            .words(this.words)
            .padding(5)
            .rotate(() => ~~(Math.random() * 2) * 90)
            .font("Impact")
            .fontSize((d) => d.size)
            .on("end", (words) => {
                d3.select(el.nativeElement).append("svg")
                    .attr("width", layout.size()[0])
                    .attr("height", layout.size()[1])
                    .append("g")
                    .attr("transform", "translate(" + layout.size()[0] / 2 + "," + layout.size()[1] / 2 + ")")
                    .selectAll("text")
                    .data(words)
                    .enter().append("text")
                    .style("font-size", function (d) {
                        return d.size + "px";
                    })
                    .style("font-family", "Impact")
                    .style("fill", function (d, i) {
                        return d3.schemeCategory20[i];
                    })
                    .attr("text-anchor", "middle")
                    .attr("transform", function (d) {
                        return "translate(" + [d.x, d.y] + ")rotate(" + d.rotate + ")";
                    })
                    .text(function (d) {
                        return d.text;
                    })
                    .on("click", function (word) {
                        wordClicked.emit(word.text);
                    });
            });

        layout.start();
    }
}
