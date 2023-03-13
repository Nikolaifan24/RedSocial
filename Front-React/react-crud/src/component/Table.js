import { Component } from "react";
import { PersonaService } from "../service/PersonaService";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";

export default class Table extends Component {
  constructor() {
    super();
    this.state = {};
    this.personaService = new PersonaService();
  }

  componentDidMount() { //Inicializa la tabla
    this.personaService
      .getAll()
      .then((data) => this.setState({ personas: data }));
  }
  render() {
    return (
      <DataTable>
        <Column header="ID"></Column>
        <Column header="Nombre"></Column>
      </DataTable>
    );
  }
}
