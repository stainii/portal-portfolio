import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WindowService {

  constructor() { }

    getScrollTop() {
        return window.pageYOffset || document.documentElement.scrollTop || document.body.scrollTop || 0;
    }

    getWidth() {
        return window.innerWidth;
    }

    openNewWindow(url: string) {
        window.open(url, '_blank');
    }

}
