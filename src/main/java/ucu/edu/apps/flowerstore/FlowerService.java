package ucu.edu.apps.flowerstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService{
    public FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(){
        this.flowerRepository = flowerRepository;

    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void add(Flower flower){
        flowerRepository.save(flower);
    }
}