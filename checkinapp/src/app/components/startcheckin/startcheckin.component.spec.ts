import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StartcheckinComponent } from './startcheckin.component';

describe('StartcheckinComponent', () => {
  let component: StartcheckinComponent;
  let fixture: ComponentFixture<StartcheckinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StartcheckinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StartcheckinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
