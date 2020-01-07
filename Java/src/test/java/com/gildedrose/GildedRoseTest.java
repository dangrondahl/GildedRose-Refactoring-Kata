package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.JunitReporter;

@UseReporter({ClipboardReporter.class, JunitReporter.class})
class GildedRoseTest {

    @Test
    void updateQuality() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Approvals.verify(app.items[0].name);
    }

}
