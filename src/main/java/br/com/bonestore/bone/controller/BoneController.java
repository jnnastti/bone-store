package br.com.bonestore.bone.controller;

import br.com.bonestore.bone.model.Bone;
import br.com.bonestore.bone.repositorio.RepositorioBone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bonestore/product")
public class BoneController {
    @Autowired
    private RepositorioBone repositorio;

    @GetMapping
    public List<Bone> getBone()
    {
        return repositorio.findAll();
    }

    @PostMapping
    public void setBone(@RequestBody Bone bone)
    {
        System.out.println("alo");
        repositorio.save(bone);
    }
}
