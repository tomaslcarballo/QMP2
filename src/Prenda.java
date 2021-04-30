//QMP2

//1er requerimiento

  enum Material{
    Trama trama = Trama.LISA; //5to requerimiento

    Material (Trama trama)

  CUERO, JEAN,.....

    }

  enum Trama{
    LISA, RAYADA,CONLUNARES,ACUADROS,ESTAMPADO
  }
//-----------------------------------------------------


enum TipoPrenda{
  Categoria categoria;

  TipoPrenda(categoria)

  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR),

  }

class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrimario;
  Color colorSecundario;

  //2do requerimiento
  public Prenda(tipo, material, colorPrimario, colorSecundario) {
    if (tipo == null) {
      throw new PrendaInvalidaException(
          "Falta el tipo de prenda"
      )
    }
    this.tipo = tipo;
    //3er requerimiento
    if (material == null) {
      throw new PrendaInvalidaException(
          "Falta el material"
      )
    }

    this.material = material;
    if (colorPrimario == null) {
      throw new PrendaInvalidaException(
          "Falta el color"
      )
      this.colorPrimario = colorPrimario;
      this.colorSecundario = colorSecundario;   //6to requerimiento
      atuendo.add(this);                        //Si la prenda pasa las validaciones anteriores la prenda es valida, entonces
      //es posible guardarla para luego crear un atuendo con la misma.
    }


    //4to requerimiento
    prenda1 = new Prenda(tipo)
    //Una vez que se crea la prenda podemos seguir agregando y cambiando atributos con los setters.
    //Ya se crea este "borrador" que nosotros podemos mdodificar mas tarde

  }
}

//2da parte

//Para que un uniforme este formado por 3 partes y que puedan variar dependiendo del colegio
//considero que lo mejor es utilizar un Builder ya que me permite definir las diferentes prendas para cada escuela.

Class Uniforme{
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public setPrendaSuperior();
  public setPrendaInferior();
  public setCalzado();

}


class UniformeBuilder{
  public void setPendaSuperior();
  public void setPrendaInferior();
  public void setCalzado()
  public obtenerPrenda();
}





