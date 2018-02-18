package pl.loremipsum.lorem.Services;

import org.springframework.stereotype.Service;

@Service
public class LoremService {

    public int generate(int from, int to) {
        return to - from;
    }

}
