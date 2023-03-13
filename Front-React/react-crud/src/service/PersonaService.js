import axios, { Axios } from "axios";

export class PersonaService {
  baseUrl = "http://localhost:8090/tienda/usuarioslistar"; //Aquí va la url del back

  getAll() {
    //Consumir la API rest
    return Axios.get(this.baseUrl + "all").then((res) => {console.log(res);});
  }
}
