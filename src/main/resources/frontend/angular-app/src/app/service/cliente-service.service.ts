import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Cliente } from '../model/cliente';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {
 
  private usersUrl: string;
 
  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/clientes';
  }
 
  public findAll(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(this.usersUrl + '/listaClientes');
  }
 
  public save(cliente: Cliente) {
    return this.http.post<Cliente>(this.usersUrl + '/addCliente', cliente);
  }

  public delete(Cliente: Cliente ){        
    return this.http.post<Cliente>(this.usersUrl + '/removeCliente/' + Cliente.id_cliente,Cliente);
  }
}
