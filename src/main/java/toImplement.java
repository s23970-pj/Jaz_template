import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@GetMapping("/currency/{minValue}/")

public List<String> getCurrency(@PathVariable("minValue") double minValue){
        String url="http://api.nbp.pl/api/exchangerates/tables/a/2023-05-15/2023-05-15/";

        Root[]roots=restTemplate.getForObject(url,Root[].class);
        List<String> filteredCodes=new ArrayList<>();

        if(roots!=null){
        for(Root root:roots){
        for(Rate rate:root.getRates()){
        if(rate.getMid()>minValue){
        filteredCodes.add(rate.getCode());
        }
        }
        }
        }

        return filteredCodes;
        }