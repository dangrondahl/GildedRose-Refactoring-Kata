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

        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                new String[]{"foo"},
                new Integer[]{0},
                new Integer[]{0});

    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return items[0].toString();
    }

}
