package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import org.approvaltests.reporters.ClipboardReporter;

@UseReporter(ClipboardReporter.class)
class GildedRoseTest {

    @Test
    void updateQuality() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Approvals.verify(app.items[0].name);
    }

}
