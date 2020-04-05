import { Component, OnInit, Input } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import { ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2/dist/sweetalert2.all.min.js';
import 'sweetalert2/src/sweetalert2.scss';
import { HttpEventType } from '@angular/common/http';
import { ModalService } from './modal.service';
//import Swal from 'sweetalert2';

@Component({
  selector: 'detalle-cliente',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.css']
})
export class DetalleComponent implements OnInit {

  @Input() cliente: Cliente;
  titulo:  string = "Detalle del Cliente";
  fotoSeleccionada: File;
  progreso: number = 0;

  constructor(private clienteService: ClienteService,
    private modalService: ModalService) { }

  ngOnInit(): void {}

  seleccionarFoto(event){
    this.fotoSeleccionada = event.target.files[0];
    this.progreso = 0;
    console.log(this.fotoSeleccionada );
    if(this.fotoSeleccionada.type.indexOf('image') < 0 ) {
      swal.fire(
        'Error Archivo : Seleccionar Imagen.',
        `El archivo debe ser del tipo imagen ${this.fotoSeleccionada.name}`,
        'error')
      this.fotoSeleccionada = null;
    }
  }

  subirFoto(){

    if(!this.fotoSeleccionada){
      swal.fire('Error : Upload.', 'el archivo debe ser del tipo imagen', 'error');
      console.log('Error : Upload.'+ this.fotoSeleccionada);
    } else {
    this.clienteService.subirFoto(this.fotoSeleccionada, this.cliente.id)
    .subscribe(event => {
         if(event.type === HttpEventType.UploadProgress){
             this.progreso = Math.round((event.loaded / event.total) * 100);
         }else if(event.type === HttpEventType.Response){
                  let response: any = event.body;
                  this.cliente =  response.cliente as Cliente;
                  swal.fire('La foto se ha subido correctamente!', response.mensaje, 'success');
         }

      });
     }
  }

  cerrarModal(){
    this.modalService.cerrarModal();
    this.fotoSeleccionada = null;
    this.progreso = 0;
    console.log("Cerrar Modal ");
  }

  getModal(): boolean{
     return this.modalService.modal;
  }
}
