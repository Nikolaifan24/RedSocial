import axios, { Axios } from "axios";

export class PersonaService {
  baseUrl = ""; //Aquí va la url del back

  getAll() {
    //Consumir la API rest
    return Axios.get(this.baseUrl + "all").then((res) => res.data.data);
  }
}
