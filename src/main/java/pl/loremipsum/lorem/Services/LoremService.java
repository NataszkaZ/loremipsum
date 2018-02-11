package pl.loremipsum.lorem.Services;

import org.springframework.stereotype.Service;

@Service
public class LoremService {

    public int generate(int start, int stop) {
        return stop - start;
    }

}
