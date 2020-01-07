package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.JunitReporter;

@UseReporter({ClipboardReporter.class, JunitReporter.class})
class GildedRoseTest {

    @Test
    void updateQuality() {
        String name = "foo";
        int sellIn = 0;
        int quality = 0;

        String itemString = doUpdateQuality(name, sellIn, quality);

        Approvals.verify(itemString);
        //CombinationApprovals.verifyAllCombinations();

    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return items[0].toString();
    }

}
