package kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void normal_item_before_sale_date() {
        GildedRose gildedRose = new GildedRose("normal", 10, 5);
        gildedRose.updateQuality();
        assertEquals(9, gildedRose.getQuality());
    }

    @Test
    public void normal_item_on_sale_date() {
        GildedRose gildedRose = new GildedRose("normal", 10, 0);
        gildedRose.updateQuality();
        assertEquals(8, gildedRose.getQuality());
    }

    @Test
    public void normal_item_after_sale_date() {
        GildedRose gildedRose = new GildedRose("normal", 10, -5);
        gildedRose.updateQuality();
        assertEquals(8, gildedRose.getQuality());
    }

    @Test
    public void normal_item_of_zero_quality() {
        GildedRose gildedRose = new GildedRose("normal", 0, 10);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test
    public void aged_brie_item_before_sale_date() {
        GildedRose gildedRose = new GildedRose("Aged Brie", 10, 5);
        gildedRose.updateQuality();
        assertEquals(11, gildedRose.getQuality());
    }

    @Test
    public void aged_brie_item_before_sale_date_with_max_quality() {
        GildedRose gildedRose = new GildedRose("Aged Brie", 50, 5);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void aged_brie_item_on_sale_date() {
        GildedRose gildedRose = new GildedRose("Aged Brie", 10, 0);
        gildedRose.updateQuality();
        assertEquals(12, gildedRose.getQuality());
    }

    @Test
    public void aged_brie_item_after_sale_date() {
        GildedRose gildedRose = new GildedRose("Aged Brie", 10, -5);
        gildedRose.updateQuality();
        assertEquals(12, gildedRose.getQuality());
    }

    @Test
    public void aged_brie_item_after_sale_date_with_max_quality() {
        GildedRose gildedRose = new GildedRose("Aged Brie", 50, -5);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void sulfuras_item_before_sale_date() {
        GildedRose gildedRose = new GildedRose("Sulfuras, Hand of Ragnaros", 10, 5);
        gildedRose.updateQuality();
        assertEquals(10, gildedRose.getQuality());
    }

    @Test
    public void sulfuras_item_on_sale_date() {
        GildedRose gildedRose = new GildedRose("Sulfuras, Hand of Ragnaros", 10, 0);
        gildedRose.updateQuality();
        assertEquals(10, gildedRose.getQuality());
    }

    @Test
    public void sulfuras_item_after_sale_date() {
        GildedRose gildedRose = new GildedRose("Sulfuras, Hand of Ragnaros", 10, -5);
        gildedRose.updateQuality();
        assertEquals(10, gildedRose.getQuality());
    }

    @Test
    public void sulfuras_item_after_sale_date2() {
        GildedRose gildedRose = new GildedRose("Sulfuras, Hand of Ragnaros", 0, -5);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test
    public void backstage_passes_item_long_before_sale_date() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 11);
        gildedRose.updateQuality();
        assertEquals(11, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_medium_close_to_sell_date_upper_bound() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        gildedRose.updateQuality();
        assertEquals(12, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_medium_close_to_sell_date_lower_bound() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 9);
        gildedRose.updateQuality();
        assertEquals(12, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_medium_close_to_sell_date_lower_bound_with_max_quality() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 9);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_medium_close_to_sell_date_lower_bound_with_max_quality2() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 49, 9);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void
    backstage_pass_very_close_to_sell_date_upper_bound() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 5);
        gildedRose.updateQuality();
        assertEquals(13, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_very_close_to_sell_date_upper_bound_with_max_quatity() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 5);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_very_close_to_sell_date_upper_bound_with_max_quatity2() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 49, 5);
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_item_on_sale_date() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 0);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test
    public void backstage_pass_item_after_sale_date() {
        GildedRose gildedRose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, -5);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_before_sale_date() {
        GildedRose gildedRose = new GildedRose("Conjured", 10, 5);
        gildedRose.updateQuality();
        assertEquals(8, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_before_sale_date_with_zero_quality() {
        GildedRose gildedRose = new GildedRose("Conjured", 0, 5);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_on_sale_date() {
        GildedRose gildedRose = new GildedRose("Conjured", 10, 0);
        gildedRose.updateQuality();
        assertEquals(6, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_on_sale_date_with_zero_quality() {
        GildedRose gildedRose = new GildedRose("Conjured", 0, 0);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_after_sale_date() {
        GildedRose gildedRose = new GildedRose("Conjured", 10, -5);
        gildedRose.updateQuality();
        assertEquals(6, gildedRose.getQuality());
    }

    @Test @Ignore
    public void conjured_item_after_sale_date_with_zero_quality() {
        GildedRose gildedRose = new GildedRose("Conjured", 0, -5);
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.getQuality());
    }

}
