package HomeWoke7.HomeWoke7;

import Response.NameResponse;
import Response.NameUpdeteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class NameController {
    @GetMapping("/names")
    public List<NameResponse> gatName() {
        List<NameResponse> names = List.of(
                new NameResponse("tarou", "T", "tanaka", 14),
                new NameResponse("caroline", "S", "sibata", 18),
                new NameResponse("tukasa", "O", "oota", 15));pwd
        return names;
    }

    @PostMapping("/names")
    public ResponseEntity<NameUpdeteResponse> responseName(@RequestBody NameUpdeteResponse nameResponse, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/name/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(new NameUpdeteResponse("a new name is created!"));
    }
}
