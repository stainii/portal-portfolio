import {AfterViewInit, Component, ElementRef, HostListener} from '@angular/core';
import {NavigationExtras, Router} from "@angular/router";
import {D3CloudWord} from "../d3-cloud-word";

@Component({
  selector: 'portfolio-technical-skillset',
  templateUrl: './technical-skillset.component.html',
  styleUrls: ['./technical-skillset.component.scss']
})
export class TechnicalSkillsetComponent implements AfterViewInit {

    words: D3CloudWord[];
    width: number;

    constructor(private el: ElementRef, private router: Router) {
        this.words = [ { text: "Angular", size: 50 },
            { text: "Docker", size: 30 },
            { text: "HTML", size: 20 },
            { text: "CSS", size: 20 },
            { text: "JavaScript", size: 20 },
            { text: "jQuery", size: 10 },
            { text: "PHP", size: 10 },
            { text: "Java EE", size: 30 },
            { text: "Spring Boot", size: 40 },
            { text: "EJB 3", size: 50 },
            { text: "JPA 2", size: 50 },
            { text: "JAX-WS", size: 40 },
            { text: "JAX-RS", size: 50 },
            { text: "CDI", size: 50 },
            { text: "Spring Boot Cloud", size: 25 },
            { text: "Spring", size: 30 },
            { text: "XML", size: 15} ,
            { text: "JUnit", size: 35 },
            { text: "DBUnit", size: 30 },
            { text: "Selenium", size: 20 },
            { text: "JBehave", size: 30 },
            { text: "PHPUnit", size: 10 },
            { text: "MySQL", size: 15 },
            { text: "PostgreSQL", size: 15 },
            { text: "Oracle", size: 15 },
            { text: "JBoss", size: 15 },
            { text: "Wildfly", size: 15 },
            { text: "Photoshop", size: 15 },
            { text: "Responsive web design", size: 20 },
            { text: "Domain Driven Design", size: 30 },
            { text: "Behaviour Driven Design", size: 30 },
            { text: "Test Driven Design", size: 30 },
            { text: "SOA", size: 25 },
            { text: "SCRUM", size: 30 },
            { text: "BPMN", size: 20 }];
    }

    ngAfterViewInit() {
        setTimeout(() => this.width = this.getMyWidth(), 10);
    }

    @HostListener('window:resize', ['$event'])
    onResize(event) {
        this.width = this.getMyWidth();
    }

    getMyWidth() {
        return this.el.nativeElement.clientWidth;
    }

    wordClicked(word: string) {
        let navigationExtras: NavigationExtras = {
            queryParams: {
                "query": word
            }
        };
        this.router.navigate(["/search"], navigationExtras);
    }
}
