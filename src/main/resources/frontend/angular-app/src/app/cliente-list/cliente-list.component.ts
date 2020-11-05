import { Component } from '@angular/core';
import { OnInit, ViewChild } from '@angular/core'
import { Cliente } from '../model/cliente';
import { ClienteServiceService } from '../service/cliente-service.service';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table'


 
@Component({
  selector: 'app-client-list',
  templateUrl: './cliente-list.component.html',
  styleUrls: ['./cliente-list.component.css']
})

export class ClienteListComponent implements OnInit {
  
  displayedColumns: string[] = ['ID', 'Nome', 'Telefone', 'Email', 'residencia', 'Municipio y Caixa Postal', 'accíon'];
 
  @ViewChild(MatPaginator, {static: true }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: true }) sort: MatSort;
  
  constructor(private ClienteService: ClienteServiceService) {
  }
 
  dataSource = new MatTableDataSource<Cliente>();

  onRowClickedDelete(row: Cliente) {
    this.ClienteService.delete(row).subscribe( () => {     
      this.ClienteService.findAll().subscribe(data => {
      this.dataSource.data = data;
      })
    })
    
  }

  onRowClickedEdit(row : any){
    console.log('Row clicked for edit: ', row);
  }
  onRowClicked(row : any){
    console.log('Row clicked: ', row);
  }

  ngOnInit() {  
    this.ClienteService.findAll().subscribe(data => {
      this.dataSource.data = data;
    })
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
  


}


