package com.techelevator;

public class ReserveAuction extends Auction {

    private final int reservePrice;
    private boolean isReserveMet = false;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        if (!isAuctionEnded() && !isReserveMet && offeredBid.getBidAmount() > reservePrice) {
            isReserveMet = true;
            super.placeBid(offeredBid);
        }
        return false;
    }

    @Override
    public boolean isAuctionEnded() {
        return isReserveMet;
    }
}
