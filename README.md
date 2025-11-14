Preguntas del bonus 
-¿Si tienes clases de las que heredas se aplicarían a LP y BlueRay?
Sí tenenos creada una clase abstracta Disco que contiene los atributos y métodos comunes
entonces tanto Vinilo como BluRay pueden heredar de Disco. 

-Si es así, extiende las nuevas clases. Si no es así, ¿deberías modificarla o ampliar una clase abstracta diferente?
No haria falta modificar la Clase Disco si solo queremos agregar nuevos discos que almacenan datos 
por ejemplo: Vinilo y BluRay ya  hererada las propiedadesde disco

-¿Qué pasa con las ruedas y los frisbees? También son discos giratorios, pero no se utilizan para el
almacenamiento de datos. ¿Cómo entrarían en este modelo de clases?

Ruedas y frisbees no son discos que guardan informacion sin embargo estas sí giran. Por eso no deberían heredar de Disco, 
sino implementamos la interfaz IGirar ya que defina el comportamiento de girar. 
