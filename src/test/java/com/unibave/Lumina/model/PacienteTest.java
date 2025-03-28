package com.unibave.Lumina.model;

import com.unibave.Lumina.model.Paciente;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

        @Test
        void cadastrarTest() {
            //Initialize
            Paciente paciente1 = new Paciente();
            paciente1.setNome("Lucca");
            paciente1.setDtNascimento(LocalDate.parse("2004-08-11"));
            paciente1.setEmail("luccapmuller@gmail.com");

            //Assert
            assertEquals("Nome: Lucca"+
                    "\nData de nascimento: 2004-08-11"+
                    "\nEmail: luccapmuller@gmail.com" +
                    "\nAtivo: 1"+
                    " \nData de cadastro "+ LocalDate.now(), paciente1.toString());
        }
}