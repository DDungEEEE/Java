package hello.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach(){
        itemRepository.clearStore();
    }

    @Test
    void save(){
        //given
        Item item= new Item("itema", 10000, 10);

        //when
        Item savedItem = itemRepository.save(item);

        //then
        Item findItem = itemRepository.findById(item.getId());
        assertThat(findItem).isEqualTo(item);
    }

    @Test
    @DisplayName("findAllItem")
    void findAll(){
        Item item1 = new Item("item1", 100000, 1);
        Item item2 = new Item("item2", 200000, 2);

        itemRepository.save(item1);
        itemRepository.save(item2);

        List<Item> result = itemRepository.findAll();

        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(item1, item2);

    }

    @Test
    @DisplayName("제품 수정")
    void updateItem(){
        Item item1 = new Item("ITEM", 10000, 1);
        Item updateItem = new Item("updateIT", 101010, 1);

        itemRepository.save(item1);
        itemRepository.update(item1.getId(), updateItem);

        assertThat(item1.getItemName()).isEqualTo(updateItem.getItemName());

    }

}