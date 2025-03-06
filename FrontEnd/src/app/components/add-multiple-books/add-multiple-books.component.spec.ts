import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMultipleBooksComponent } from './add-multiple-books.component';

describe('AddMultipleBooksComponent', () => {
  let component: AddMultipleBooksComponent;
  let fixture: ComponentFixture<AddMultipleBooksComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddMultipleBooksComponent]
    });
    fixture = TestBed.createComponent(AddMultipleBooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
