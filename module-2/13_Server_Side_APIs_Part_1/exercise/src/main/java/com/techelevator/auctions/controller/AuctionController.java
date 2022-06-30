package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false, defaultValue = "") String title,
                              @RequestParam(required = false, name = "title_like") String titleLike,
                              @RequestParam(required = false, name = "currentBid_lte", defaultValue = "0") double currentBidLte) {

        List<Auction> auctions = dao.list();

        if (title.equals("")) {
            return auctions;
        }

        List<Auction> filteredAuctions = new ArrayList<>();
        if (titleLike != null && currentBidLte > 0) {
            return dao.searchByTitleAndPrice(titleLike, currentBidLte);
        }

        if (titleLike != null) {
            return dao.searchByTitle(titleLike);
        }

        if (currentBidLte > 0) {
            return dao.searchByPrice(currentBidLte);
        }
//        List<Auction> filteredAuctions = new ArrayList<>();


        for (Auction auction : auctions) {
            if (auction.getTitle().equalsIgnoreCase(title)) {
                filteredAuctions.add(auction);
            }
        }

        return filteredAuctions;



    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction createAuction(@RequestBody Auction auctionToCreate) {
        dao.create(auctionToCreate);
        return dao.get(auctionToCreate.getId());
    }


}
