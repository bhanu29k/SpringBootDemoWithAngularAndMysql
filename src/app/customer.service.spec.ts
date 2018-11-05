import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';

import { RouterModule } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientModule } from '@angular/common/http'; 

import { CustomerService } from './customer.service';

describe('CustomerService', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      
      imports:[FormsModule,RouterTestingModule,HttpClientModule],
      providers:[RouterModule]
    })
    .compileComponents();
  }));

  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustomerService = TestBed.get(CustomerService);
    expect(service).toBeTruthy();
  });
});
