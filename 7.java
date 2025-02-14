package projekt;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @GetMapping
    public void getAllPosts() {
        // Return list of posts from the database
    }

    @PostMapping
    public void createPost(@RequestMapping(value = "") Post post) {
        // Save the post to the database
    }
}
