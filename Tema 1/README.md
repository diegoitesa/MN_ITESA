# Tema 1
    Introducción MN

## Competencia del tema
    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

## Actividades
- [T2  --- E1  ---  Mapa Conceptual/presentación](/Tema%202/Evidencia%201/)
- [T2 ---  E2   -----  Problemario](/Tema%202/Evidencia%202/)
- [ T2   --   E3  --- Eval Escrita](/Tema%202/Evidencia%203/)



# Apuntes

## Tipos de errores en métodos numéricos

### Error absoluto  
- Es la diferencia entre el valor verdadero y el valor aproximado.  
- Se calcula así:  
  \[
  \text{Error absoluto} = | \text{Valor verdadero} - \text{Valor aproximado} |
  \]  
- Nos dice **cuánto nos equivocamos en total**.  

🧠 **Idea clave**: Es el tamaño del error en unidades reales.

---

### Error relativo  
- Compara el error absoluto con el valor verdadero.  
- Se calcula así:  
  \[
  \text{Error relativo} = \frac{\text{Error absoluto}}{|\text{Valor verdadero}|}
  \]  
- Se usa cuando queremos saber **qué tan grande es el error respecto al valor real**.  
- A veces se multiplica por 100 para dar el **porcentaje de error relativo**.  

🧠 **Idea clave**: Es el error **en proporción** al valor verdadero.

---

### Error porcentual  
- Es el error relativo expresado en porcentaje.  
- Se calcula así:  
  \[
  \text{Error porcentual} = \left( \frac{\text{Error absoluto}}{|\text{Valor verdadero}|} \right) \times 100\%
  \]  
- Es más intuitivo porque nos dice **el error en porcentaje**, lo que ayuda a interpretarlo mejor.  

🧠 **Idea clave**: Es el error relativo **convertido a porcentaje**.

---

### Error de truncamiento  
- Ocurre cuando **se corta una serie o un proceso matemático**, como una serie infinita, antes de tiempo.  
- También aparece cuando **se redondean números** al usar un número finito de cifras.  

🧠 **Idea clave**: Es el error por **no terminar completamente un cálculo exacto**.

---

### Error de redondeo  
- Sucede cuando **se ajustan los números a cierta cantidad de cifras decimales**.  
- Es común en las calculadoras o computadoras.  
- No se puede evitar del todo, pero se puede controlar.  

🧠 **Idea clave**: Es el error por **ajustar los números para que se vean “bonitos” o caben en la memoria**.
