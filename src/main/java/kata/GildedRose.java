package kata;

class GildedRose {

    private String name;
    private int quality;
    private int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void updateQuality() {
        if (!name.equals("Aged Brie")
                && !name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality > 0) {
                if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality -= 1;
                }
            }
        } else {
            if (quality < 50) {
                quality += 1;

                if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (daysRemaining < 11) {
                        if (quality < 50) {
                            quality += 1;
                        }
                    }

                    if (daysRemaining < 6) {
                        if (quality < 50) {
                            quality += 1;
                        }
                    }
                }
            }
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            daysRemaining -= 1;
        }

        if (daysRemaining < 0) {
            if (!name.equals("Aged Brie")) {
                if (!name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (quality > 0) {
                        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                            quality -= 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality += 1;
                }
            }
        }

    }

    public int getQuality() {
        return quality;
    }
}




