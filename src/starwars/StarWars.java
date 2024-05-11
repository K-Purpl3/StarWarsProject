package starwars;

/**
 *
 * @author KermitPurpl3
 */

import java.util.Scanner;

public class StarWars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar el texto de inicio
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana...");
        System.out.println("La Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una "
                + "nave imperial robada en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio está construyendo para destruirla.");
        System.out.println("(Presiona Enter para continuar)");

        // Esperar a que el usuario presione Enter
        scanner.nextLine();

        // Ir al Nivel 1
        nivel1(scanner);
    }
    
    
    /* Definir las demás etapas como métodos separados, osea
    cada nivel o etapa estara en un nuevo public static void, 
    se entiende lo que quiero decir*/
    public static void nivel1(Scanner scanner) {
        
    // Mostrar el texto introductorio del Nivel 1
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al" +
"sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el" +
"computador tiene problemas para calcular parte de las coordenadas de salto." +
"Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie." +
"Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que" +
"calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive)." +
"¿Qué debe introducir?");
        System.out.println("Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.");

    // Generar números aleatorios para S1 y S2
       int S1 = (int) (1 + Math.random() * 10);
       int S2 = (int) (20 + Math.random() * 11);

    // Mostrar la pregunta al usuario
        System.out.println("Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).");
        System.out.println("¿Qué debe introducir?");

    // Respuesta correcta
        int respuestaCorrecta = calcularSumatorio(S1, S2);

    // Leer la respuesta del usuario
        int respuestaUsuario = scanner.nextInt();

    // Verificar la respuesta del usuario
        if (respuestaUsuario == respuestaCorrecta) {
            System.out.println("Respuesta correcta. ¡Pasas al siguiente nivel!");
            nivel2(scanner); // Pasar al Nivel 2
    }   else {
            perder(); // Mostrar el mensaje de perder
    }
}

// Método para calcular el sumatorio desde S1 hasta S2
    public static int calcularSumatorio(int S1, int S2) {
        int sumatorio = S1 + S2;
        for (int i=S1;i<=S2;i++) {
        sumatorio =+ i;
        System.out.println(sumatorio);
        /* he puesto este system out println porque 
        intentar adivinar el numero todo el rato y fallar cansa*/

    }
    return sumatorio;

}

  public static void nivel2(Scanner scanner) {
    
    // Mostrar el texto introductorio del Nivel 2
    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella" +
"de la muerte. Como van en una nave imperial robada se aproximan lentamente con" +
"la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí" +
"agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados" +
"en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa." +
"“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso" +
"para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde" +
"“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el" +
"manual del piloto que estaba en la guantera y da con la página correcta. El código" +
"es el productorio entre el nº del agente y el nº de la nave (ambos inclusive)." +
"¿Cuál es el código?");
    // Mostrar más texto introductorio

    // Generar números aleatorios para P1 y P2
    int P1 = (int) (1 + Math.random() * 8);
    int P2 = (int) (8 + Math.random() * (8 - 12 +1));

    // Mostrar la pregunta al usuario
    System.out.println("El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).");
    System.out.println("¿Cuál es el código?");

    // Respuesta correcta
    int respuestaCorrecta = calcularProductorio(P1, P2);

    // Leer la respuesta del usuario
    int respuestaUsuario = scanner.nextInt();

    // Verificar la respuesta del usuario
    if (respuestaUsuario == respuestaCorrecta) {
        System.out.println("Respuesta correcta. ¡Pasas al siguiente nivel!");
        nivel3(scanner); // Pasar al Nivel 3
    } else {
        perder(); // Mostrar el mensaje de perder
    }
}

// Método para calcular el productorio entre P1 y P2
    public static int calcularProductorio(int P1, int P2) {
        int respuestaCorrecta=P1;
        for(int i=P1;i<=P2;i++){
        respuestaCorrecta= respuestaCorrecta *i;
        System.out.println(respuestaCorrecta);
        // he puesto este system out println porque para intentar adivinar el numero todo el rato cansa

        }   
    return respuestaCorrecta; 
}
    
public static void nivel3(Scanner scanner) {
    
    // Mostrar el texto introductorio del Nivel 3
    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se" +
"equipan con trajes de soldados imperiales que encuentran en la nave para pasar" +
"desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se" +
"encuentra el reactor principal. Se dirigen al primer panel computerizado que" +
"encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita" +
"introducir una clave de acceso. Entonces recuerda la información que le proporcionó" +
"Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10" +
"(redondeando N hacia abajo), donde N es el nº de niveles”." +
"¿Cual es el nivel correcto?");

    // Generar un número aleatorio para N
    int N = (int) (Math.random() * 51) + 50; // Número aleatorio entre 50 y 100

    // Mostrar la pregunta al usuario
    System.out.println("Ahora deben averiguar en qué nivel de los N existentes se encuentra el reactor principal.");
    System.out.println("La clave de acceso a los planos de la nave es el factorial de N/10 (redondeando N hacia abajo).");
    System.out.println("¿Cuál es el nivel correcto?");

    // Respuesta correcta
    int respuestaCorrecta = calcularFactorial(N);

    // Leer la respuesta del usuario
    int respuestaUsuario = scanner.nextInt();

    // Verificar la respuesta del usuario
    if (respuestaUsuario == respuestaCorrecta) {
        System.out.println("Respuesta correcta. ¡Pasas al siguiente nivel!");
        nivel4(scanner); // Pasar al Nivel 4
    } else {
        perder(); // Mostrar el mensaje de perder
    }
}

// Método para calcular el factorial de N/10
public static int calcularFactorial(int N) {

    int factorial = 1;
    for (int i = N; i <= N; i++) {
        factorial *= i;
    System.out.println(factorial);
    // he puesto este system out println porque para intentar adivinar el numero todo el rato cansa

    }
    return factorial;
}

public static void nivel4(Scanner scanner) {
    // Mostrar el texto introductorio del Nivel 4
    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta" +
"acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para" +
"intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita" +
"verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es" +
"introduce un 0.");

    // Generar un número aleatorio para P
    int P = (int) (Math.random() * 91) + 10; // Número aleatorio entre 10 y 100

    // Mostrar la pregunta al usuario
    System.out.println("R2D2 se conecta al panel de acceso para intentar hackear el sistema y abrir la puerta...");
    System.out.println("Para desencriptar la clave necesita verificar si el número P es primo o no.");
    System.out.println("Si es primo introduce un 1, si no lo es introduce un 0.");
    System.out.println("¿Es primo el número " + P + "?");

    // Calcular la respuesta correcta
    int respuestaCorrecta = esPrimo(P);

    // Leer la respuesta del usuario
    int respuestaUsuario = scanner.nextInt();

    // Verificar la respuesta del usuario
    if (respuestaUsuario == respuestaCorrecta) {
        System.out.println("Respuesta correcta. ¡Pasas al siguiente nivel!");
        nivel5(scanner); // Pasar al Nivel 5
    } else {
        perder(); // Mostrar el mensaje de perder
    }
}

// Método para verificar si un número es primo
public static int esPrimo(int P) {
    if (P<=1) {
        return 0;
    }
    for (int i = 2; i <= Math.sqrt(P); i++)
        if (P % i == 0){
            return 0;
        }
    return 1; 
}

public static void nivel5(Scanner scanner) {
    // Mostrar el texto introductorio del Nivel 5
    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba," +
"programe el temporizador y salir de allí corriendo. Necesita programarlo para que" +
"explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar" +
"antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y" +
"desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto" +
"peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar" +
"el factorial de M y el factorial de S. ¿Qué valor debe introducir?");

    // Generar números aleatorios para M y S
     int M = (int) (Math.random() * 6) + 5; // Número aleatorio entre 5 y 10
        int S = (int) (Math.random() * 6) + 5; // Número aleatorio entre 5 y 10

        // Mostrar la pregunta al usuario
        System.out.println("Necesita programarlo para que explote en exactamente " + M + " minutos y " + S + " segundos...");
        System.out.println("¿Qué valor debe introducir?");

        // Calcular la respuesta correcta
        int respuestaCorrecta = calcularValor(M, S);

        // Leer la respuesta del usuario
        int respuestaUsuario = scanner.nextInt();

        // Verificar la respuesta del usuario
        if (respuestaUsuario == respuestaCorrecta) {
            ganar(); // Mostrar mensaje de ganar
        } else {
            perder(); // Mostrar el mensaje de perder
        }
    }

    // Método para calcular la respuesta correcta
    public static int calcularValor(int M, int S) {
        // Calcular los factoriales de M y S
        int factorialM = calcularFactorial(M);
        int factorialS = calcularFactorial(S);

        // Sumar los factoriales
        int valorIntroducir = factorialM + factorialS;
        System.out.println(valorIntroducir);
        //Muestra el valorIntroducir
        return valorIntroducir; 
        // Devolver el valor que se debe introducir
    }

    // Método para calcular el factorial de un número
    public static int calcularFactorial2(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;
    }


public static void perder() {
    // Mostrar el mensaje de perder
    System.out.println("Ese no era el código correcto...");
    System.out.println("La misión ha sido un fracaso :( :( :(");
    System.out.println("Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
}

public static void ganar() {
    // Mostrar el mensaje de ganar
    System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a sonar las alarmas...");
    System.out.println("Salen de allí corriendo, no hay tiempo que perder.");
    System.out.println("La nave se convierte en un hervidero de soldados de arriba a abajo...");
    System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena :D");
}
}

