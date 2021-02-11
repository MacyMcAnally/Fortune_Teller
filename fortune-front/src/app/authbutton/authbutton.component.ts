import { Component } from '@angular/core';

// Import the AuthService type from the SDK
import { AuthService } from '@auth0/auth0-angular';

@Component({
  selector: 'app-auth-button',
  templateUrl: './authbutton.component.html'
})
export class AuthbuttonComponent {
  // Inject the authentication service into your component through the constructor
  constructor(public auth: AuthService) {}
}