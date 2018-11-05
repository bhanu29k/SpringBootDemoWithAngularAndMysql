import {AddCustomerComponent} from '../../app/add-customer/add-customer.component';
import { CustomerService} from '../customer.service';
import { TestBed,async} from '@angular/core/testing';
import { Customer } from '../customer';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientModule, HttpClient, HttpHandler,HttpXhrBackend, XhrFactory } from '@angular/common/http';
import {AppComponent} from '../../app/app.component';


xdescribe("updateCustomer",()=>{
    let component:AddCustomerComponent;
    
   // cust : Customer = new Customer();

       beforeEach(()=>{
TestBed.configureTestingModule({
    declarations: [ AddCustomerComponent ],
    imports:[FormsModule,RouterTestingModule,HttpClientModule],
    providers:[AddCustomerComponent]
});
component=TestBed.get(AddCustomerComponent);
       });
       it("should return true if input is Default",()=>{
        component.addCustomer();
        const result=component;
        expect(result).toBe(true);
    });
    it('should create an instance',()=>{ 
        expect(component).toBeDefined();
    });
});
