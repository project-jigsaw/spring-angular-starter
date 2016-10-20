import { Component } from '@angular/core';

@Component({
    selector: 'my-app',
    templateUrl: './my-app.html'
})

export class MyAppComponent {
    word = 'test';

    something;

    constructor() {

        this.something = 23;
    }
}