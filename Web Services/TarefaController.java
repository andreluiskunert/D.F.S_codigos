// @RestController
// @RequestMapping("tarefa")
// @CrossOrigin("*")
// public class TarefaController {
//     private static final HashMap<String,Tarefa> tarefas =
//                          new HashMap<>();
//     @GetMapping
//     public List<Tarefa> obterTarefas(){
//         return new ArrayList<>(tarefas.values());
//     }
//     @PostMapping
//     public void incluirTarefa(@RequestBody Tarefa tarefa){
//         tarefas.put(tarefa.codigo, tarefa);
//     }
//     @DeleteMapping("{codigo}")
//     public void excluirTarefa(@PathVariable String codigo ){
//         tarefas.remove(codigo);
//     }
// }