import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {NormalHeaderComponent} from './normal-header.component';
import {HeaderMenuComponent} from "../header-menu/header-menu.component";

describe('NormalHeaderComponent', () => {
  let component: NormalHeaderComponent;
  let fixture: ComponentFixture<NormalHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NormalHeaderComponent, HeaderMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NormalHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
