package com.springbootproject.springbootproject.controller;

import com.springbootproject.springbootproject.model.Antrian;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/antrian")
public class AntrianController {
    public List<Antrian> antrians = new ArrayList<>();
    public Integer counter = 1;
    public Integer counterAntrian = 1;
    @GetMapping(path="/daftar-antrian")
    public List<Antrian> daftarAntrian(){

        antrians.add(new Antrian(1,1, "Andi", 321602372,true));
        antrians.add(new Antrian(2,2, "Lohlohhhh", 321602371,false));
        antrians.add(new Antrian(3,3, "Ki Joko Bodo", 321602374,false));
        return antrians;

    }
    @PostMapping(path="tambah")
    public Antrian tambahDataAntrian(@RequestBody Antrian request){
        request.setId(counter);
        request.setAntrian(counterAntrian);
        antrians.add(request);
        counter++;
        counterAntrian++;
        return request;

    }
    @PutMapping(path="/edit/{id}")
    public Boolean updateData(@RequestBody Antrian request, @PathVariable Integer id){
        final Optional<Antrian> result = antrians.stream().filter(antrian -> antrian.getId()==id).findFirst();
        if (result.isPresent()){
            // update
            result.get().setNamaNasabah(request.getNamaNasabah());
            result.get().setNik(request.getNik());
            return true;
        }else{
            return false;
        }
    }

    @DeleteMapping(path="/hapus/{id}")
    public Boolean hapusData(@PathVariable Integer id){
        final Optional<Antrian> result = antrians.stream().filter(antrian -> antrian.getId()==id).findFirst();
        if (result.isPresent()){
            antrians.remove(result.get());
            return true;
        }else{
            return false;
        }
    }

}
