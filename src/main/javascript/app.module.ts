import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {MyAppComponent} from "./components/my-app/my-app";

@NgModule({
    imports: [BrowserModule],
    declarations: [MyAppComponent],
    bootstrap: [MyAppComponent]
})
export class AppModule {

}