import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ClienteServiceService } from '../service/cliente-service.service';
import { Cliente } from '../model/cliente';


@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css']
})
export class ClienteFormComponent implements OnInit {

  cliente: Cliente;
 
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private ClienteServiceService: ClienteServiceService) {
    this.cliente = new Cliente();
  }

  ngOnInit(): void {
  }

   
  onSubmit() {
    this.ClienteServiceService.save(this.cliente).subscribe(result => this.gotoListaClientes());
  }
 
  gotoListaClientes() {
    this.router.navigate(['ClienteList']);
  }

}
