import axios from "axios";

export class PersonaService {
  baseUrl = "http://localhost:8090/tienda/usuarioslistar"; //Aquí va la url del back

  getAll() {
    //Consumir la API rest
    return axios.get(this.baseUrl).then((res) => {
      console.log(res.data);
    });
  }
}
