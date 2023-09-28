package homework7.homework7;

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
                new NameResponse("tukasa", "O", "oota", 15));

        return names;
    }

    @PostMapping("/names")
    public ResponseEntity<NameCreateResponse> responseName(@RequestBody NameCreateRequest nameResponse, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/name/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(new NameCreateResponse("a new name is created!"));
    }
}
