package es.ulpgc.eite.da.letters_numbers;


import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.letters.LetterListActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("ALL")
public class EspressoTests {


    @Rule
    public ActivityTestRule<LetterListActivity> rule =
        new ActivityTestRule<>(LetterListActivity.class);

    public EspressoRobot robot = new EspressoRobot();


    @After
    public void resetTest() {
        AppMediator.resetInstance();
    }

    public void rotateScreen() {

        try {

            UiDevice device = UiDevice.getInstance(getInstrumentation());

            Thread.sleep(700);
            device.setOrientationLeft();
            Thread.sleep(700);
            device.setOrientationNatural();
            Thread.sleep(700);

        } catch (Exception e) {

        }

    }



    ////////// PORTRAIT TESTS //////////


    @Test
    public void test01_CrearPrimeraLetra() { // 1

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetrasConDimensionP1("1");
    }

    @Test
    public void test02_CrearSegundaLetra() { // 2

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }

    @Test
    public void test03_PulsarEnSegundaLetra() { // 3

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void test04_CrearPrimerNumeroParaSegundaLetra() { // 4

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void test05_CrearSegundoNumeroParaSegundaLetra() { // 5

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumerosConDimensionP1("2");
    }

    @Test
    public void test06_RegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }

    @Test
    public void test07_CrearTercerLetra() { // 7

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void test08_PulsarEnTerceraLetra() { // 8

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }


    @Test
    public void test09_RegresarDesdePrimerNumeroParaTerceraLetra() { // 9

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void test10_PulsarEnPrimeraLetra() { // 10

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }


    @Test
    public void test11_RegresarDesdePrimerNumeroParaPrimeraLetra() { // 11

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    ////////// LANDSCAPE TESTS //////////


    @Test
    public void test12_CrearPrimeraLetraConRotacion() { // 12

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetrasConDimensionP1("1");
    }

    @Test
    public void test13_CrearSegundaLetraConRotacion() { // 13

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }

    @Test
    public void test14_PulsarEnSegundaLetraConRotacion() { // 14

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void test15_CrearPrimerNumeroParaSegundaLetraConRotacion() { // 15

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void test16_CrearSegundoNumeroParaSegundaLetraConRotacion() { // 16

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumerosConDimensionP1("2");
    }

    @Test
    public void test17_RegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 17

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }

    @Test
    public void test18_CrearTercerLetraConRotacion() { // 18

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void test19_PulsarEnTerceraLetraConRotacion() { // 19

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }


    @Test
    public void test20_RegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 20

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void test21_PulsarEnPrimeraLetraConRotacion() { // 21

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }


    @Test
    public void test22_RegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 22

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

}