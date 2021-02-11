import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyCookiesComponent } from './my-cookies.component';

describe('MyCookiesComponent', () => {
  let component: MyCookiesComponent;
  let fixture: ComponentFixture<MyCookiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyCookiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MyCookiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
