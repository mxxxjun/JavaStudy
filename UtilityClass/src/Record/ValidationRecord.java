package Record;

record ValidationRecord(int x, int y) {
    ValidationRecord{
        if (x < 0) x = 0;
        if (y < 0) y = 0;
    }
}
