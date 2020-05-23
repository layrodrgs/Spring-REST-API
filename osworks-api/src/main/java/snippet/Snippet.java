package snippet;

public class Snippet {
	public static void main(String[] args) {
		if(!clienteRepository.existsById(clienteId)) {
					return ResponseEntity.notFound().build();
				}
	}
}

