import { Component } from "react";
import { PersonaService } from "../service/PersonaService";

export default class Table extends Component {
  constructor() {
    super();
    this.state = {};
    this.personaService = new PersonaService();
  }

  /*componentDidMount() { //Inicializa la tabla
    this.personaService
      .getAll()
      .then((data) => this.setState({ personas: data }));
  }*/
  render() {
    return <h1>Hola mundo</h1>;
  }
}
