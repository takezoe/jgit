import org.eclipse.jgit.junit.RepositoryTestCase;
import org.eclipse.jgit.lib.Repository;
	private TestRepository<Repository> testDb;
		testDb = new TestRepository<Repository>(db);
	private static String makeDiffHeader(String pathA, String pathB,
			ObjectId aId,
	private static String makeDiffHeaderModeChange(String pathA, String pathB,