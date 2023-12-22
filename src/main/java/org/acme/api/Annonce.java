package org.acme.api;

import java.util.List;

import org.acme.models.AnnonceModel;
import org.acme.services.AnnonceService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Annonce {
    
    @Inject
    AnnonceService annonceService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AnnonceModel> getAllAnnonces() {
        return annonceService.getAllAnnonces();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAnnonce(AnnonceModel annonce) {
        annonceService.addAnnonce(annonce);
    }
}
