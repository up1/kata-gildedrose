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

    private void updateQualityOfNormal() {
        this.daysRemaining -= 1;
        if (this.quality == 0) {
            return;
        }

        this.quality -= 1;

        if (this.daysRemaining <= 0) {
            this.quality -= 1;
        }
    }

    private void updateQualityOfAgedBrie() {
        this.daysRemaining -= 1;
        if (this.quality >= 50) {
            return;
        }
        this.quality += 1;
        if (this.daysRemaining <= 0) {
            this.quality += 1;
        }
    }

    private void updateQualityOfBackstage() {
        this.daysRemaining -= 1;
        if (this.quality >= 50) {
            return;
        }
        if (this.daysRemaining < 0) {
            this.quality = 0;
            return;
        }
        this.quality += 1;
        if (this.daysRemaining < 10) {
            this.quality += 1;
        }
        if (this.daysRemaining < 5) {
            this.quality += 1;
        }
    }

    private void updateQualityOfSulfuras() {

    }


    public void updateQuality() {

        if (name.equals("normal")) {
            updateQualityOfNormal();
            return;
        } else if (name.equals("Aged Brie")) {
            updateQualityOfAgedBrie();
            return;
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            updateQualityOfSulfuras();
            return;
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateQualityOfBackstage();
            return;
        }
    }


    public int getQuality() {
        return quality;
    }
}




