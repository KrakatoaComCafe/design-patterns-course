package designpatterns;

import designpatterns.state.Orcamento;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class OrcamentoTest {

    private Orcamento orcamento;

    @AfterEach
    public void afterEach() {
        orcamento = null;
    }

    @Test
    public void given_2OfTheSameItemsInTheList_When_ExistemDoisItensIguaisNaLista_Then_ReturnTrue() {
        Item item = Mockito.mock(Item.class);
        List<Item> itens = Arrays.asList(item, item);

        this.orcamento = new Orcamento(500.0, itens);
        boolean result = this.orcamento.existemDoisItensIguaisNaLista();

        Assertions.assertTrue(result);
    }

    @Test
    public void given_DifferentItemsInTheList_When_ExistemDoisItensIguaisNaLista_Then_ReturnFalse() {
        Item item1 = Mockito.mock(Item.class);
        Item item2 = Mockito.mock(Item.class);
        List<Item> itens = Arrays.asList(item1, item2);

        this.orcamento = new Orcamento(500.0, itens);
        boolean result = this.orcamento.existemDoisItensIguaisNaLista();

        Assertions.assertFalse(result);
    }
}