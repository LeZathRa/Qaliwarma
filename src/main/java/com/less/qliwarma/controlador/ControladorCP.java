/*package com.less.qliwarma.controlador;

import java.time.LocalDateTime;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.less.qliwarma.modelo.Categoria;
import com.less.qliwarma.modelo.Producto;
import com.less.qliwarma.service.CategoriaService;
import com.less.qliwarma.service.ProductoService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/categorias")
public class ControladorCP {

    @Autowired
    private CategoriaService categoriaService;
    
    @Autowired
    private ProductoService productoService;


    @GetMapping("/ListaCategorias")
    public String ListaCategorias(Model model) {
        List<Categoria> categorias = categoriaService.getAllCategorias();
        model.addAttribute("categorias", categorias);
        return "categorias/ListaCategorias";
    }

    @GetMapping("/verProductos/{idCategoria}")
    public String verProductos(@PathVariable Integer idCategoria, Model model) {
        Categoria categoria = categoriaService.getCategoria(idCategoria)
                            .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        List<Producto> productos = categoria.getProductos();
        model.addAttribute("productos", productos);
        return "productos/verProductos";
    }
    
    @GetMapping("/agregarCategoria")
    public String agregarCategoria(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categorias/agregarCategoria";
    }
    
    @PostMapping("/guardarCategoria")
    public String guardarCategoria(@Valid @ModelAttribute("categoria") Categoria categoria,
    		BindingResult bindingResult) {

    	if (bindingResult.hasErrors()) {
            return "categorias/agregarCategoria"; 
        }
    	categoriaService.guardarCategoria(categoria);
        return "redirect:/categorias/ListaCategorias";
    }
    
    @GetMapping("/editarCategoria/{idCategoria}")
    public String editarCategoria(@PathVariable Integer idCategoria, Model model) {
        Categoria categoria = categoriaService.getCategoria(idCategoria)
                            .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        model.addAttribute("categoria", categoria);
        return "categorias/editarCategoria";
    }

    @PostMapping("/eliminarCategoria/{idCategoria}")
    public String eliminarCategoria(@PathVariable Integer idCategoria) {
        categoriaService.eliminarCategoria(idCategoria);
        return "redirect:/categorias/ListaCategorias";
    }
    @GetMapping("/agregarProducto/{idCategoria}")
    public String agregarProducto(@PathVariable Integer idCategoria, Model model) {
        Categoria categoria = categoriaService.getCategoria(idCategoria)
                            .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        Producto nuevoProducto = new Producto();
        nuevoProducto.setCategoria(categoria);

        model.addAttribute("categoria", categoria);
        model.addAttribute("nuevoProducto", nuevoProducto);

        return "productos/agregarProducto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto nuevoProducto) {
        productoService.save(nuevoProducto);
        return "redirect:/categorias/ListaCategorias"; 
    }
    @GetMapping("/verDetallesProducto/{idProducto}")
    public String verDetallesProducto(@PathVariable Integer idProducto, Model model) {
        Producto producto = productoService.get(idProducto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        model.addAttribute("producto", producto);
        return "productos/Detalles";
    }
    
    @GetMapping("/editar/{idProducto}")
    public String editarProducto(@PathVariable Integer idProducto, Model model) {
        Producto producto = productoService.get(idProducto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        model.addAttribute("producto", producto);
        return "productos/editarProducto";
    }
    @PostMapping("/actualizarProducto/{id}")
    public String actualizarProducto(@PathVariable Integer id, Producto producto) {
        Producto productoExistente = productoService.get(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setDescripcion(producto.getDescripcion());
        productoExistente.setImagen(producto.getImagen());
        productoExistente.setCantidad(producto.getCantidad());

        productoExistente.setFechaUltimaModificacion(LocalDateTime.now());

        productoService.save(productoExistente);

        return "redirect:/categorias/verDetallesProducto/" + id;
    }
    
    @GetMapping("/eliminar/{idProducto}")
    public String eliminarProducto(@PathVariable Integer idProducto) {
        productoService.delete(idProducto);
        return "redirect:/categorias/ListaCategorias";
    }
    
}

*/