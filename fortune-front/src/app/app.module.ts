import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthModule } from '@auth0/auth0-angular';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './components/home/home.component';
import { MyCookiesComponent } from './components/my-cookies/my-cookies.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    MyCookiesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AuthModule.forRoot({
      domain: 'dev-mbukza.us.auth0.com',
      clientId: 'SkCiBeBjwmw87JN02YmBRhH9bHkMaGku'
    }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
