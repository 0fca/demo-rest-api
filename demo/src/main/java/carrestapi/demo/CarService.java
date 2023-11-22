package carrestapi.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// TODO: Ten serwis jest dokładną repliką repozytorium, które jest pustym interface'em. 
// To bez sensu, w tak płaskim przypadku można spłaszczyć kod zupełnie
@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    private final List<Car> cars = new ArrayList<>();

    public void deleteAllCars() {
        carRepository.deleteAll();
    }
}
