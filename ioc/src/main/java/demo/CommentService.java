package demo;

public class CommentService {

  private CommentDao commentDao;

  private BaseDao baseDao;

  public BaseDao getBaseDao() {
    return baseDao;
  }

  public void setBaseDao(BaseDao baseDao) {
    this.baseDao = baseDao;
  }

  public int getCount() {
    return commentDao.getCommentCount();
  }
  public int getBaseCount() {
    return baseDao.getBaseCount();
  }
  public void setCommentDao(CommentDao commentDao) {
    this.commentDao = commentDao;
  }

  public CommentService(CommentDao commentDao) {
    this.commentDao = commentDao;
  }

  public CommentService() {
  }
}
